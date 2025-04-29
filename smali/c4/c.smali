.class public abstract Lc4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/c$a;,
        Lc4/c$b;,
        Lc4/c$d;,
        Lc4/c$c;,
        Lc4/c$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final M:[Ljava/lang/String;

.field private static final N:[Lb4/d;


# instance fields
.field private final A:Ljava/util/ArrayList;

.field private B:Lc4/f1;

.field private C:I

.field private final D:Lc4/c$a;

.field private final E:Lc4/c$b;

.field private final F:I

.field private final G:Ljava/lang/String;

.field private volatile H:Ljava/lang/String;

.field private I:Lb4/b;

.field private J:Z

.field private volatile K:Lc4/i1;

.field protected L:Ljava/util/concurrent/atomic/AtomicInteger;

.field private j:I

.field private k:J

.field private l:J

.field private m:I

.field private n:J

.field private volatile o:Ljava/lang/String;

.field p:Lc4/s1;

.field private final q:Landroid/content/Context;

.field private final r:Landroid/os/Looper;

.field private final s:Lc4/i;

.field private final t:Lb4/f;

.field final u:Landroid/os/Handler;

.field private final v:Ljava/lang/Object;

.field private final w:Ljava/lang/Object;

.field private x:Lc4/n;

.field protected y:Lc4/c$c;

.field private z:Landroid/os/IInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lb4/d;

    sput-object v0, Lc4/c;->N:[Lb4/d;

    const-string v0, "service_esmobile"

    const-string v1, "service_googleme"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc4/c;->M:[Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lc4/i;Lb4/f;ILc4/c$a;Lc4/c$b;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc4/c;->o:Ljava/lang/String;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lc4/c;->v:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lc4/c;->w:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc4/c;->A:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput v1, p0, Lc4/c;->C:I

    iput-object v0, p0, Lc4/c;->I:Lb4/b;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lc4/c;->J:Z

    iput-object v0, p0, Lc4/c;->K:Lc4/i1;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Context must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc4/c;->q:Landroid/content/Context;

    const-string p1, "Looper must not be null"

    invoke-static {p2, p1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lc4/c;->r:Landroid/os/Looper;

    const-string p1, "Supervisor must not be null"

    invoke-static {p3, p1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lc4/c;->s:Lc4/i;

    const-string p1, "API availability must not be null"

    invoke-static {p4, p1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, Lc4/c;->t:Lb4/f;

    new-instance p1, Lc4/c1;

    invoke-direct {p1, p0, p2}, Lc4/c1;-><init>(Lc4/c;Landroid/os/Looper;)V

    iput-object p1, p0, Lc4/c;->u:Landroid/os/Handler;

    iput p5, p0, Lc4/c;->F:I

    iput-object p6, p0, Lc4/c;->D:Lc4/c$a;

    iput-object p7, p0, Lc4/c;->E:Lc4/c$b;

    iput-object p8, p0, Lc4/c;->G:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic R(Lc4/c;)Lb4/b;
    .locals 0

    iget-object p0, p0, Lc4/c;->I:Lb4/b;

    return-object p0
.end method

.method static bridge synthetic S(Lc4/c;)Lc4/c$a;
    .locals 0

    iget-object p0, p0, Lc4/c;->D:Lc4/c$a;

    return-object p0
.end method

.method static bridge synthetic T(Lc4/c;)Lc4/c$b;
    .locals 0

    iget-object p0, p0, Lc4/c;->E:Lc4/c$b;

    return-object p0
.end method

.method static bridge synthetic U(Lc4/c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lc4/c;->w:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic W(Lc4/c;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lc4/c;->A:Ljava/util/ArrayList;

    return-object p0
.end method

.method static bridge synthetic X(Lc4/c;Lb4/b;)V
    .locals 0

    iput-object p1, p0, Lc4/c;->I:Lb4/b;

    return-void
.end method

.method static bridge synthetic Y(Lc4/c;Lc4/n;)V
    .locals 0

    iput-object p1, p0, Lc4/c;->x:Lc4/n;

    return-void
.end method

.method static bridge synthetic Z(Lc4/c;ILandroid/os/IInterface;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lc4/c;->g0(ILandroid/os/IInterface;)V

    return-void
.end method

.method static bridge synthetic a0(Lc4/c;Lc4/i1;)V
    .locals 0

    iput-object p1, p0, Lc4/c;->K:Lc4/i1;

    invoke-virtual {p0}, Lc4/c;->Q()Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, p1, Lc4/i1;->m:Lc4/f;

    invoke-static {}, Lc4/t;->b()Lc4/t;

    move-result-object p1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc4/f;->G()Lc4/u;

    move-result-object p0

    :goto_0
    invoke-virtual {p1, p0}, Lc4/t;->c(Lc4/u;)V

    :cond_1
    return-void
.end method

.method static bridge synthetic b0(Lc4/c;I)V
    .locals 2

    iget-object p1, p0, Lc4/c;->v:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lc4/c;->C:I

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc4/c;->J:Z

    const/4 p1, 0x5

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iget-object v0, p0, Lc4/c;->u:Landroid/os/Handler;

    iget-object p0, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    const/16 v1, 0x10

    invoke-virtual {v0, p1, p0, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method static bridge synthetic d0(Lc4/c;)Z
    .locals 0

    iget-boolean p0, p0, Lc4/c;->J:Z

    return p0
.end method

.method static bridge synthetic e0(Lc4/c;IILandroid/os/IInterface;)Z
    .locals 2

    iget-object v0, p0, Lc4/c;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lc4/c;->C:I

    if-eq v1, p1, :cond_0

    monitor-exit v0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p3}, Lc4/c;->g0(ILandroid/os/IInterface;)V

    monitor-exit v0

    const/4 p0, 0x1

    :goto_0
    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic f0(Lc4/c;)Z
    .locals 2

    iget-boolean v0, p0, Lc4/c;->J:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc4/c;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lc4/c;->A()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lc4/c;->D()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    :goto_0
    return v1
.end method

.method private final g0(ILandroid/os/IInterface;)V
    .locals 12

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :goto_0
    if-nez p2, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    const/4 v4, 0x1

    :goto_1
    if-ne v3, v4, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-static {v1}, Lc4/s;->a(Z)V

    iget-object v1, p0, Lc4/c;->v:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lc4/c;->C:I

    iput-object p2, p0, Lc4/c;->z:Landroid/os/IInterface;

    const/4 v3, 0x0

    if-eq p1, v2, :cond_9

    const/4 v2, 0x2

    const/4 v4, 0x3

    if-eq p1, v2, :cond_4

    if-eq p1, v4, :cond_4

    if-eq p1, v0, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lc4/c;->J(Landroid/os/IInterface;)V

    goto/16 :goto_4

    :cond_4
    iget-object v9, p0, Lc4/c;->B:Lc4/f1;

    if-eqz v9, :cond_5

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    if-eqz p1, :cond_5

    const-string p2, "GmsClient"

    invoke-virtual {p1}, Lc4/s1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lc4/s1;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Calling connect() while still connected, missing disconnect() for "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v5, p0, Lc4/c;->s:Lc4/i;

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p1}, Lc4/s1;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p1}, Lc4/s1;->a()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x1081

    invoke-virtual {p0}, Lc4/c;->V()Ljava/lang/String;

    move-result-object v10

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p1}, Lc4/s1;->c()Z

    move-result v11

    invoke-virtual/range {v5 .. v11}, Lc4/i;->g(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iget-object p1, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_5
    new-instance p1, Lc4/f1;

    iget-object p2, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {p1, p0, p2}, Lc4/f1;-><init>(Lc4/c;I)V

    iput-object p1, p0, Lc4/c;->B:Lc4/f1;

    iget p2, p0, Lc4/c;->C:I

    if-ne p2, v4, :cond_6

    invoke-virtual {p0}, Lc4/c;->A()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance p2, Lc4/s1;

    invoke-virtual {p0}, Lc4/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lc4/c;->A()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/16 v8, 0x1081

    const/4 v9, 0x0

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lc4/s1;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    goto :goto_2

    :cond_6
    new-instance p2, Lc4/s1;

    invoke-virtual {p0}, Lc4/c;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lc4/c;->E()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x1081

    invoke-virtual {p0}, Lc4/c;->H()Z

    move-result v9

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lc4/s1;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    :goto_2
    iput-object p2, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p2}, Lc4/s1;->c()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Lc4/c;->h()I

    move-result p2

    const v0, 0x1110e58

    if-lt p2, v0, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p2}, Lc4/s1;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    iget-object p2, p0, Lc4/c;->s:Lc4/i;

    iget-object v0, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {v0}, Lc4/s1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {v2}, Lc4/s1;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lc4/c;->V()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {v5}, Lc4/s1;->c()Z

    move-result v5

    invoke-virtual {p0}, Lc4/c;->v()Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, Lc4/m1;

    const/16 v8, 0x1081

    invoke-direct {v7, v0, v2, v8, v5}, Lc4/m1;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    invoke-virtual {p2, v7, p1, v4, v6}, Lc4/i;->h(Lc4/m1;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Z

    move-result p1

    if-nez p1, :cond_a

    const-string p1, "GmsClient"

    iget-object p2, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p2}, Lc4/s1;->b()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {v0}, Lc4/s1;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unable to connect to service: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " on "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x10

    iget-object p2, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-virtual {p0, p1, v3, p2}, Lc4/c;->c0(ILandroid/os/Bundle;I)V

    goto :goto_4

    :cond_9
    iget-object v8, p0, Lc4/c;->B:Lc4/f1;

    if-eqz v8, :cond_a

    iget-object v4, p0, Lc4/c;->s:Lc4/i;

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p1}, Lc4/s1;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p1}, Lc4/s1;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x1081

    invoke-virtual {p0}, Lc4/c;->V()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lc4/c;->p:Lc4/s1;

    invoke-virtual {p1}, Lc4/s1;->c()Z

    move-result v10

    invoke-virtual/range {v4 .. v10}, Lc4/i;->g(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iput-object v3, p0, Lc4/c;->B:Lc4/f1;

    :cond_a
    :goto_4
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method protected A()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected B()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final C()Landroid/os/IInterface;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lc4/c;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lc4/c;->C:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Lc4/c;->q()V

    iget-object v1, p0, Lc4/c;->z:Landroid/os/IInterface;

    const-string v2, "Client is connected but service is null"

    invoke-static {v1, v2}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Landroid/os/DeadObjectException;

    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected abstract D()Ljava/lang/String;
.end method

.method protected abstract E()Ljava/lang/String;
.end method

.method protected F()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms"

    return-object v0
.end method

.method public G()Lc4/f;
    .locals 1

    iget-object v0, p0, Lc4/c;->K:Lc4/i1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lc4/i1;->m:Lc4/f;

    return-object v0
.end method

.method protected H()Z
    .locals 2

    invoke-virtual {p0}, Lc4/c;->h()I

    move-result v0

    const v1, 0xc9e4920

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public I()Z
    .locals 1

    iget-object v0, p0, Lc4/c;->K:Lc4/i1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected J(Landroid/os/IInterface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lc4/c;->l:J

    return-void
.end method

.method protected K(Lb4/b;)V
    .locals 2

    invoke-virtual {p1}, Lb4/b;->B()I

    move-result p1

    iput p1, p0, Lc4/c;->m:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lc4/c;->n:J

    return-void
.end method

.method protected L(I)V
    .locals 2

    iput p1, p0, Lc4/c;->j:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lc4/c;->k:J

    return-void
.end method

.method protected M(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 2

    iget-object v0, p0, Lc4/c;->u:Landroid/os/Handler;

    new-instance v1, Lc4/g1;

    invoke-direct {v1, p0, p1, p2, p3}, Lc4/g1;-><init>(Lc4/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    const/4 p1, 0x1

    const/4 p2, -0x1

    invoke-virtual {v0, p1, p4, p2, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public O(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc4/c;->H:Ljava/lang/String;

    return-void
.end method

.method public P(I)V
    .locals 3

    iget-object v0, p0, Lc4/c;->u:Landroid/os/Handler;

    iget-object v1, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public Q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final V()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc4/c;->G:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc4/c;->q:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public a()Z
    .locals 3

    iget-object v0, p0, Lc4/c;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lc4/c;->C:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Lc4/c$c;)V
    .locals 1

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc4/c;->y:Lc4/c$c;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lc4/c;->g0(ILandroid/os/IInterface;)V

    return-void
.end method

.method public c(Lc4/k;Ljava/util/Set;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc4/k;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Lc4/c;->z()Landroid/os/Bundle;

    move-result-object v2

    new-instance v15, Lc4/g;

    iget v5, v1, Lc4/c;->F:I

    iget-object v14, v1, Lc4/c;->H:Ljava/lang/String;

    sget v6, Lb4/f;->a:I

    sget-object v9, Lc4/g;->x:[Lcom/google/android/gms/common/api/Scope;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    sget-object v13, Lc4/g;->y:[Lb4/d;

    const/4 v4, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v3, v15

    move-object v12, v13

    move-object/from16 v19, v14

    move/from16 v14, v16

    move-object/from16 v20, v15

    move/from16 v15, v17

    move/from16 v16, v18

    move-object/from16 v17, v19

    invoke-direct/range {v3 .. v17}, Lc4/g;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lb4/d;[Lb4/d;ZIZLjava/lang/String;)V

    iget-object v3, v1, Lc4/c;->q:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, v20

    iput-object v3, v4, Lc4/g;->m:Ljava/lang/String;

    iput-object v2, v4, Lc4/g;->p:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    iput-object v0, v4, Lc4/g;->o:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lc4/c;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc4/c;->t()Landroid/accounts/Account;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/accounts/Account;

    const-string v2, "<<default account>>"

    const-string v3, "com.google"

    invoke-direct {v0, v2, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iput-object v0, v4, Lc4/g;->q:Landroid/accounts/Account;

    if-eqz p1, :cond_3

    invoke-interface/range {p1 .. p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, v4, Lc4/g;->n:Landroid/os/IBinder;

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lc4/c;->N()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lc4/c;->t()Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, v4, Lc4/g;->q:Landroid/accounts/Account;

    :cond_3
    :goto_0
    sget-object v0, Lc4/c;->N:[Lb4/d;

    iput-object v0, v4, Lc4/g;->r:[Lb4/d;

    invoke-virtual/range {p0 .. p0}, Lc4/c;->u()[Lb4/d;

    move-result-object v0

    iput-object v0, v4, Lc4/g;->s:[Lb4/d;

    invoke-virtual/range {p0 .. p0}, Lc4/c;->Q()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, v4, Lc4/g;->v:Z

    :cond_4
    :try_start_0
    iget-object v2, v1, Lc4/c;->w:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, Lc4/c;->x:Lc4/n;

    if-eqz v0, :cond_5

    new-instance v3, Lc4/e1;

    iget-object v5, v1, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    invoke-direct {v3, v1, v5}, Lc4/e1;-><init>(Lc4/c;I)V

    invoke-interface {v0, v3, v4}, Lc4/n;->n2(Lc4/m;Lc4/g;)V

    goto :goto_1

    :cond_5
    const-string v0, "GmsClient"

    const-string v3, "mServiceBroker is null, client disconnected"

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_2
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v0, 0x8

    iget-object v2, v1, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v3, v2}, Lc4/c;->M(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void

    :catch_2
    move-exception v0

    throw v0

    :catch_3
    move-exception v0

    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lc4/c;->P(I)V

    return-void
.end method

.method protected final c0(ILandroid/os/Bundle;I)V
    .locals 2

    iget-object p2, p0, Lc4/c;->u:Landroid/os/Handler;

    new-instance v0, Lc4/h1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lc4/h1;-><init>(Lc4/c;ILandroid/os/Bundle;)V

    const/4 p1, 0x7

    const/4 v1, -0x1

    invoke-virtual {p2, p1, p3, v1, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public d(Lc4/c$e;)V
    .locals 0

    invoke-interface {p1}, Lc4/c$e;->a()V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc4/c;->o:Ljava/lang/String;

    invoke-virtual {p0}, Lc4/c;->n()V

    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h()I
    .locals 1

    sget v0, Lb4/f;->a:I

    return v0
.end method

.method public i()Z
    .locals 4

    iget-object v0, p0, Lc4/c;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lc4/c;->C:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()[Lb4/d;
    .locals 1

    iget-object v0, p0, Lc4/c;->K:Lc4/i1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lc4/i1;->k:[Lb4/d;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lc4/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc4/c;->p:Lc4/s1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc4/s1;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to connect when checking package"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc4/c;->o:Ljava/lang/String;

    return-object v0
.end method

.method public n()V
    .locals 4

    iget-object v0, p0, Lc4/c;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Lc4/c;->A:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc4/c;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Lc4/c;->A:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc4/d1;

    invoke-virtual {v3}, Lc4/d1;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc4/c;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v1, p0, Lc4/c;->w:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lc4/c;->x:Lc4/n;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lc4/c;->g0(ILandroid/os/IInterface;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final q()V
    .locals 2

    invoke-virtual {p0}, Lc4/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract r(Landroid/os/IBinder;)Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            ")TT;"
        }
    .end annotation
.end method

.method protected s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t()Landroid/accounts/Account;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()[Lb4/d;
    .locals 1

    sget-object v0, Lc4/c;->N:[Lb4/d;

    return-object v0
.end method

.method protected v()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public w()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final x()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lc4/c;->q:Landroid/content/Context;

    return-object v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lc4/c;->F:I

    return v0
.end method

.method protected z()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method
